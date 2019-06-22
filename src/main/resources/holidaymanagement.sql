SET
sql_mode = "NO_AUTO_VALUE_ON_ZERO";

SET
time_zone = "+00:00";

CREATE TABLE Project(
                          idproject   VARCHAR(50) PRIMARY KEY,
                          projectname VARCHAR(25) collate utf8_bin NOT NULL,
                          description VARCHAR(200) COLLATE utf8_bin DEFAULT NULL
)
engine = innodb DEFAULT charset = utf8 COLLATE = utf8_bin;

CREATE TABLE Employee(
                          idemployee   INT(10) PRIMARY KEY,
                          firstname    VARCHAR(30) collate utf8_bin NOT NULL,
                          lastname     VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          username     VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          password     VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          mailadress   VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          grade        VARCHAR(30) COLLATE utf8_bin NOT NULL,
                          idproject    VARCHAR(50),
                          idsupervisor INT(10),
                          initialbalance FLOAT(4, 2) NOT NULL,
                          currentbalance FLOAT(4, 2) NOT NULL,
                          CONSTRAINT fk_project FOREIGN KEY(idproject) REFERENCES Project(idproject),
                          CONSTRAINT fk_employee FOREIGN KEY(idsupervisor) REFERENCES Employee(idemployee)
)

engine = innodb DEFAULT charset = utf8 COLLATE = utf8_bin;

CREATE TABLE Holiday(
                          idholiday   INT(20) NOT NULL PRIMARY KEY,
                          refholiday  VARCHAR(255) collate utf8_bin NOT NULL,
                          daterequest date NOT NULL,
                          startdate   date NOT NULL,
                          enddate     date NOT NULL,
                          duration FLOAT(4, 2) NOT NULL,
                          idemployee INT(10) NOT NULL,
                          status     VARCHAR (20) COLLATE utf8_bin NOT NULL,
                          comment    VARCHAR(300) COLLATE utf8_bin DEFAULT NULL,
                          type       VARCHAR(10) COLLATE utf8_bin DEFAULT NULL,
                          CONSTRAINT fk_employee_holiday FOREIGN KEY(idemployee) REFERENCES Employee(idemployee)
)
engine = innodb DEFAULT charset = utf8 COLLATE = utf8_bin;