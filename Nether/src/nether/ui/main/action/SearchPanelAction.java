package nether.ui.main.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import static net.proteanit.sql.DbUtils.resultSetToTableModel;
import nether.data.SqliteConnectionUtil;
import nether.ui.component.DetailedErrorDialog;

@Deprecated
public class SearchPanelAction {

    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private Connection connection;

    public SearchPanelAction() {
    }
    
    @Deprecated
    public void updateTable(JTable table) {
        String query = "SELECT "
                + "RegistroDescripcion AS 'Descripción',"
                + "RegistroTipo AS 'Tipo',"
                + "RegistroFecha AS 'Fecha',"
                + "RegistroConcepto AS 'Concepto'"
                + "FROM Registro";
        try {
            connection = SqliteConnectionUtil.createConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            table.setModel(resultSetToTableModel(resultSet));

        } catch (Exception e) {
            DetailedErrorDialog.showErrorDialog("Ha ocurrido un error al cargar los datos", e.toString() + System.getProperty("line.separator") + System.getProperty("line.separator"));
        } finally {
            try {
                preparedStatement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                DetailedErrorDialog.showErrorDialog("Ha ocurrido un error al cerrar los datos", e.toString() + System.getProperty("line.separator") + System.getProperty("line.separator"));
            }
        }
    }
    
    @Deprecated
    public void findByConcept(JTable table, String description) {
        String query = "SELECT "
                + "RegistroDescripcion AS 'Descripción', "
                + "RegistroTipo AS 'Tipo', "
                + "RegistroFecha AS 'Fecha', "
                + "RegistroConcepto AS 'Concepto' "
                + "FROM Registro "
                + "WHERE RegistroDescripcion LIKE '%" + description + "%'";
        try {
            connection = SqliteConnectionUtil.createConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();

            table.setModel(resultSetToTableModel(resultSet));

        } catch (ClassNotFoundException | SQLException e) {
            DetailedErrorDialog.showErrorDialog("Ha ocurrido un error al cargar los datos", e.toString() + System.getProperty("line.separator") + System.getProperty("line.separator"));
        } finally {
            try {
                preparedStatement.close();
                resultSet.close();
                connection.close();
            } catch (SQLException e) {
                DetailedErrorDialog.showErrorDialog("Ha ocurrido un error al cerrar los datos", e.toString() + System.getProperty("line.separator") + System.getProperty("line.separator"));
            }
        }
    }
}
