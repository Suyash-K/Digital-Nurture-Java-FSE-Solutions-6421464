BEGIN
  FOR rec IN (
    SELECT 
      c.name       AS cust_name,
      l.cust_id    AS cust_id,
      l.due_date   AS due_date
    FROM loans l
    JOIN customers c
      ON l.cust_id = c.cust_id
    WHERE l.due_date 
          BETWEEN TRUNC(SYSDATE) 
              AND TRUNC(SYSDATE) + 30
    ORDER BY l.due_date
  ) LOOP
    DBMS_OUTPUT.PUT_LINE(
      'Reminder: Loan for ' 
      || rec.cust_name
      || ' (ID ' || rec.cust_id || ') '
      || 'is due on ' 
      || TO_CHAR(rec.due_date, 'DD-MON-YYYY')
    );
  END LOOP;
END;
/
