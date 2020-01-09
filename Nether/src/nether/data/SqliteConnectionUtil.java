package nether.data;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import nether.util.config.ConfigConstants;

/**
 * This class has the utilities to work with SQLite databases. Encapsulates the
 * Connection-related operations that every JDBC program seems to use.
 *
 * @author Héctor
 */
public class SqliteConnectionUtil {

    /**
     * The default settings
     */
    private static final String DEFAULT_DB_DRIVER = "org.sqlite.JDBC";
    private static final String DEFAULT_DB_PATH = "jdbc:sqlite:data/Data.System.db";

    public SqliteConnectionUtil() {
    }

    /**
     * The current config filename
     */
    private static String CONFIG_FILE_NAME = ConfigConstants.CONFIG_FILE;

    /**
     * Creates a connection with the given SQLite database path.
     *
     * @param databasePath Path to the SQLite database file.
     * @return Database connection to given path
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection createConnection(String databasePath) throws ClassNotFoundException, SQLException {
        System.out.println("Loading driver " + DEFAULT_DB_DRIVER);
        Class.forName(DEFAULT_DB_DRIVER);
        System.out.println("Connection to " + databasePath + " successful");

        return DriverManager.getConnection("jdbc:sqlite:" + databasePath);
    }

    /**
     * Creates a connection with the default SQLite database. The default
     * database path is defined within this class by DEFAULT_DB_PATH constant.
     *
     * @return Database connection
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public static Connection createConnection() throws ClassNotFoundException, SQLException {
        // Load the database driver
        System.out.println("Loading driver " + DEFAULT_DB_DRIVER);
        Class.forName(DEFAULT_DB_DRIVER);
        System.out.println("Connection to " + DEFAULT_DB_PATH + " successful");

        return DriverManager.getConnection(DEFAULT_DB_PATH);
    }

    /**
     * Returns the full path of the configuration file being used.
     *
     * @return Returns the config file name.
     */
    public static String getConfigFileName() {
        return CONFIG_FILE_NAME;
    }

    /**
     * Sets the full path of the config file to read.
     *
     * @param configFileName The FileName of the configuration file to use.
     */
    public static void setConfigFileName(String configFileName) {
        //configFileName = configFileName;
        File file = new File(configFileName);
        if (!file.canRead()) {
            throw new IllegalArgumentException("Unreadable: " + configFileName);
        }
        try {
            SqliteConnectionUtil.CONFIG_FILE_NAME = file.getCanonicalPath();
        } catch (IOException ex) {
            System.err.println("Warning: IO error checking path: " + configFileName);
            SqliteConnectionUtil.CONFIG_FILE_NAME = configFileName;
        }
    }
}
