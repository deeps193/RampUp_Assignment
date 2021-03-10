DELIMITER //
CREATE PROCEDURE AgeUpdate()
BEGIN
DECLARE user_status VARCHAR(40); 
UPDATE user1
SET user_status = 'Child' 
WHERE Age <= 18;
 SELECT ('Child');
UPDATE user1
SET user_status = 'Adult'
WHERE Age > 18 AND Age < 35;
SELECT ('Adult');
UPDATE user1
SET user_status = 'Senior' 
WHERE Age > 35;
 SELECT ('Senior');
END //
DELIMITER ;