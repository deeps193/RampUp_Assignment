DELIMITER //
CREATE PROCEDURE UpdateAge()
BEGIN
DECLARE temp_id INTEGER;
DECLARE user_statusValue VARCHAR(40);
DECLARE AgeValue INTEGER;
DECLARE cursor1 CURSOR FOR SELECT u.Age,u.user_status FROM user1 u WHERE id=temp_id;
OPEN cursor1;
first_loop: LOOP
FETCH cursor1 into AgeValue, user_statusValue;
IF AgeValue <=18 THEN 
    UPDATE user1  SET user_status = 'Child' WHERE id=temp_id;
    ELSEIF AgeValue >18 AND AgeValue <60 THEN
    UPDATE user1  SET user_status = 'Adult' WHERE id=temp_id;
    ELSE 
    UPDATE user1  SET user_status = 'Senior' WHERE id=temp_id;
commit;
END IF;
END LOOP;
CLOSE cursor1;
END //
DELIMITER ;
