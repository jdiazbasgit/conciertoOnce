
import ReactPDF from '@react-pdf/renderer';
import MyDocument from './FichajesPdf';

ReactPDF.render(<MyDocument />, `${__dirname}/example.pdf`);