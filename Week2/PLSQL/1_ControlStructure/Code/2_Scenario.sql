BEGIN
  FOR rec IN (
    SELECT cust_id,
           balance
      FROM customers
  ) LOOP
    IF rec.balance > 10000 THEN
      UPDATE customers
         SET is_vip = 'Y'
       WHERE cust_id = rec.cust_id;

      DBMS_OUTPUT.PUT_LINE(
        'Customer ' || rec.cust_id ||
        ' marked VIP (balance=' || rec.balance || ')'
      );
    END IF;
  END LOOP;

  COMMIT;
END;
/