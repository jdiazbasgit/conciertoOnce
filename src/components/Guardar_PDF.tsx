
import ReactPDF from '@react-pdf/renderer';
import MyDocument from './Crear_PDF';

ReactPDF.render(<MyDocument />, `${__dirname}/example.pdf`);