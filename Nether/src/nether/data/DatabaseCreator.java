/*
 *  29/12/2017
 */
package nether.data;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * A SQLite database file creator. This class can create new database files to a
 * given directory or to the default application directory.
 *
 * @author Héctor
 */
public class DatabaseCreator {

    private static Connection connection = null;
    private static Statement statement = null;

    /**
     * Creates a new instance of DatabaseCreator.
     *
     */
    public DatabaseCreator() {

    }

    /**
     * Creates a SQLite database in the given directory. The file name must be
     * specified.
     *
     * @param databasePath File name and path to database.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void createDatabase(String databasePath) throws SQLException, ClassNotFoundException {
        createDirectory(databasePath);
        createTable(DatabaseStructure.GENDERLIST, databasePath);
        createTable(DatabaseStructure.USERINFO, databasePath);
        createTable(DatabaseStructure.USERLIST, databasePath);
    }

    /**
     * Creates a SQLite database in the default directory.
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public void createDefaultDatabase() throws SQLException, ClassNotFoundException {
        createDirectory(DatabaseDefaultSettings.DB_DEFAULT_DIRECTORY);
        createTable(DatabaseStructure.GENDERLIST, DatabaseDefaultSettings.DB_DEFAULT_FILE);
        createTable(DatabaseStructure.USERINFO, DatabaseDefaultSettings.DB_DEFAULT_FILE);
        createTable(DatabaseStructure.USERLIST, DatabaseDefaultSettings.DB_DEFAULT_FILE);
    }

    /**
     * Inserts a table to a SQLite database.
     *
     * @param tableQuery Query string to create a table.
     * @param databaseFilePath Path to database file.
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    private void createTable(String tableQuery, String databaseFilePath)
            throws SQLException, ClassNotFoundException {

        connection = SqliteConnectionUtil.createConnection(databaseFilePath);
        statement = connection.createStatement();
        statement.executeUpdate(tableQuery);

        statement.close();
        connection.close();
    }

    /**
     * Creates a directory to store database file.
     *
     * @param databaseDirectoryPath Path where the directory should be created.
     */
    private void createDirectory(String databaseDirectoryPath) {
        File dir = new File(databaseDirectoryPath);

        if (!dir.exists()) {
            boolean isDirectoryCreated = dir.mkdir();
            if (isDirectoryCreated) {
                System.out.println("Database directory created");
            } else {
                System.out.println("Failed to create database directory");
            }

        }
    }
}
