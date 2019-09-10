SET
sql_mode = "NO_AUTO_VALUE_ON_ZERO";

SET
time_zone = "+00:00";

CREATE TABLE Project(
                          projectid   VARCHAR(50) PRIMARY KEY,
                          projectname VARCHAR(25) collate utf8_bin NOT NULL,
                          description VARCHAR(200) COLLATE utf8_bin DEFAULT NULL
)
engine = innodb DEFAULT charset = utf8 COLLATE = utf8_bin;

CREATE TABLE Employee(
                          employeeid   INT(10) PRIMARY KEY,
                          firstname    VARCHAR(30) collate utf8_bin NOT NULL,
                          lastname     VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          username     VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          password     VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          mailadress   VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          grade        VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          projectid    VARCHAR(50),
                          supervisorid INT(10),
                          initialbalance FLOAT(4, 2) NOT NULL,
                          currentbalance FLOAT(4, 2) NOT NULL,
                          notifications BOOLEAN NOT NULL,
                          CONSTRAINT fk_project FOREIGN KEY(projectid) REFERENCES Project(projectid),
                          CONSTRAINT fk_employee FOREIGN KEY(supervisorid) REFERENCES Employee(employeeid)
)

engine = innodb DEFAULT charset = utf8 COLLATE = utf8_bin;

CREATE TABLE Holiday(
                          refholiday  VARCHAR(255) NOT NULL PRIMARY KEY,
                          daterequest date NOT NULL,
                          startdate   date NOT NULL,
                          enddate     date NOT NULL,
                          duration FLOAT(4, 2) NOT NULL,
                          employeeid INT(10) NOT NULL,
                          status     VARCHAR (20) COLLATE utf8_bin NOT NULL,
                          comment    VARCHAR(300) COLLATE utf8_bin DEFAULT NULL,
                          type       VARCHAR(10) COLLATE utf8_bin DEFAULT NULL,
                          CONSTRAINT fk_employee_holiday FOREIGN KEY(employeeid) REFERENCES Employee(employeeid)
)
engine = innodb DEFAULT charset = utf8 COLLATE = utf8_bin;