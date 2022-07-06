import React from 'react';
import ReactDOM from 'react-dom';
import { PDFViewer } from '@react-pdf/renderer';
import MyDocument from './Crear_PDF';

const App = () => (
  <PDFViewer>
    <MyDocument />
  </PDFViewer>
);

ReactDOM.render(<App />, document.getElementById('root'));