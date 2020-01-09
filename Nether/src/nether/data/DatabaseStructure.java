/*
 *  2/01/2018
 */
package nether.data;

/**
 * Representa la estructura de la base de datos
 * 
 * @author Héctor
 */
public final class DatabaseStructure {

    /**
     * Table GenderList
     */
    public static final String GENDERLIST
            = "CREATE TABLE GenderList (\n"
            + "Id   INTEGER      PRIMARY KEY AUTOINCREMENT\n"
            + "                  UNIQUE\n"
            + "                  NOT NULL,\n"
            + "Name VARCHAR (50) NOT NULL\n"
            + ");";

    /**
     * Table UserList.
     *
     */
    public static final String USERLIST
            = "CREATE TABLE UserList (\n"
            + "Id             INTEGER       NOT NULL\n"
            + "                             UNIQUE\n"
            + "                             REFERENCES UserInfo (Id),\n"
            + "Nickname       VARCHAR (50)  NOT NULL,\n"
            + "Password       VARCHAR (50)  NOT NULL,\n"
            + "ProfilePicture VARCHAR (400) NOT NULL\n"
            + "                             DEFAULT ('') \n"
            + ");";
    /**
     * Table UserInfo
     *
     */
    public static final String USERINFO
            = "CREATE TABLE UserInfo (\n"
            + "Id         INTEGER      PRIMARY KEY AUTOINCREMENT\n"
            + "                        UNIQUE\n"
            + "                        NOT NULL,\n"
            + "NameFirst  VARCHAR (50) NOT NULL\n"
            + "                        DEFAULT (''),\n"
            + "NameMiddle VARCHAR (50) NOT NULL\n"
            + "                        DEFAULT (''),\n"
            + "NameLast   VARCHAR (50) NOT NULL\n"
            + "                        DEFAULT (''),\n"
            + "BirthDate  DATE         NOT NULL\n"
            + "                        DEFAULT ( (date('now') ) ),\n"
            + "Gender     INTEGER      NOT NULL\n"
            + "                        REFERENCES GenderList (Id) \n"
            + "                        DEFAULT (3) \n"
            + ");";

}
