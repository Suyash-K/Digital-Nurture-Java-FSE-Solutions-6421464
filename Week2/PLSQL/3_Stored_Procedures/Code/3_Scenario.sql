CREATE OR REPLACE PROCEDURE TransferFunds (
  p_from_acct  IN  accounts.acct_id%TYPE,
  p_to_acct    IN  accounts.acct_id%TYPE,
  p_amount     IN  NUMBER
) AS
  v_balance  accounts.balance%TYPE;
BEGIN
  SELECT balance
    INTO v_balance
    FROM accounts
   WHERE acct_id = p_from_acct
   FOR UPDATE;  
  
  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(
      -20001,
      'Insufficient funds in account '||p_from_acct
    );
  END IF;
  
  UPDATE accounts
     SET balance = balance - p_amount
   WHERE acct_id = p_from_acct;
  
  UPDATE accounts
     SET balance = balance + p_amount
   WHERE acct_id = p_to_acct;
  
  COMMIT;
END TransferFunds;
/