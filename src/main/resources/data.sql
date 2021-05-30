DROP TABLE IF EXISTS rendezvous;
 
CREATE TABLE rendezvous (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  code_rv VARCHAR(250),
  date_rv DATE,
  description VARCHAR(250) ,
  lieu VARCHAR(250)
);
 
INSERT INTO rendezvous ( date_rv, description, lieu) VALUES
  (curdate() , 'desc1', 'kebemer'),
  (curdate() ,  'desc2', 'sophie'),
  (curdate() , 'desc3', 'dakar');