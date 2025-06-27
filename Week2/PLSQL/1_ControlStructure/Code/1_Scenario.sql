BEGIN
  FOR rec IN (
    SELECT l.cust_id,
           l.interest_rate
      FROM loans l
      JOIN customers c
        ON l.cust_id = c.cust_id
     WHERE c.age > 60
  )
  LOOP
    UPDATE loans
       SET interest_rate = rec.interest_rate * 0.99
     WHERE cust_id = rec.cust_id;
    
    DBMS_OUTPUT.PUT_LINE(
      'Applied 1% discount to cust ' 
       || rec.cust_id
       || ': old=' || rec.interest_rate
       || ', new=' || TO_CHAR(rec.interest_rate*0.99)
    );
  END LOOP;
  
  COMMIT;
END;
/
