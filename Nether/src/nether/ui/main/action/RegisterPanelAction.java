package nether.ui.main.action;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import nether.data.SqliteConnectionUtil;
import nether.ui.main.RegisterPanel;

/**
 *
 * @author Héctor-
 */
@Deprecated
public class RegisterPanelAction {

    private static Connection connection = null;
    private static ResultSet resultSet = null;
    private static PreparedStatement preparedStatement = null;

    public RegisterPanelAction() {

    }

    /**
     * Clears the content filled in the forms.
     */
    @Deprecated
    public void clearFields() {
        RegisterPanel.setConceptFieldValue("");
        RegisterPanel.setDateFieldValue(null);
        RegisterPanel.setDescriptionFieldValue("");
        RegisterPanel.setTypeFieldValue("");
    }

    /**
     * Adds a new registry to the database
     */
    @Deprecated
    public void addNewRegistry() {
        insertRegistry();
    }
    @Deprecated
    public void insertRegistry() {
        String query = "INSERT INTO Registro("
                + "RegistroDescripcion,"
                + "RegistroTipo,"
                + "RegistroFecha, "
                + "RegistroConcepto) "
                + "VALUES (?,?,?,?)";
        try {

            connection = SqliteConnectionUtil.createConnection();
            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, RegisterPanel.getDescriptionFieldValue());
            preparedStatement.setString(2, RegisterPanel.getTypeFieldValue());
            preparedStatement.setString(3, RegisterPanel.getDateFieldValue());
            preparedStatement.setString(4, RegisterPanel.getConceptFieldValue());

            preparedStatement.execute();

        } catch (HeadlessException | SQLException e) {
            System.out.print(e);
        } catch (ClassNotFoundException ex) {
        }
    }
}
