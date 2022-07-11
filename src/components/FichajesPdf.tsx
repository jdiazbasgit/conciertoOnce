/*  https://www.npmjs.com/package/@react-pdf/renderer  */

/* https://react-pdf.org/  */
//React pdf-renderer:
//https://github.com/diegomura/react-pdf/issues/971

import { Document, Page, Text, View, StyleSheet, PDFDownloadLink } from '@react-pdf/renderer';
import ReactDOM from 'react-dom';
import { isWhiteSpaceLike } from 'typescript';

// Establecer los estilos del pdf
const styles = StyleSheet.create({
  header:{
    color: '#FFFFFF',
    backgroundColor: '#54AEFF',
  },
  page: {
    flexDirection: 'row',
    backgroundColor: '#E4E4E4',
    title:'Registro Jornada Trabajadores'
  },
  section: {
    margin: 10,
    padding: 10,
    flexGrow: 1
  }
});

// Crear Pdf
const FichajesPdf = () => (
  <Document>
    <Page size="A4" style={styles.page}>
      <View style={styles.header}>
        <Text>REGISTRO DE JORNADA TRABAJADORES</Text>
      </View>
      <View style={styles.section}>
        <Text>Section #1</Text>
      </View>
      <View style={styles.section}>
        <Text>Section #2</Text>
      </View>
    </Page>
  </Document>
);

//Mostrar PDF en la página web/componente
ReactDOM.render(<FichajesPdf />, document.getElementById('root'));

export default FichajesPdf;

// https://controlhorario.me/wp-content/uploads/2021/01/registro_jornada-opcion1.pdf

// https://codesandbox.io/s/o1wp2?file=/src/components/reports/InvoiceItemsTable.js

/* https://www.npmjs.com/package/@shauncenter/react-pdf-renderer  */

/* https://stackoverflow.com/questions/56373850/how-can-i-create-a-table-using-the-react-pdf-library-for-generation-pdf-report */