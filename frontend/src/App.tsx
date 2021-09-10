import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";


function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h4 className="text-primary">Tabela de Vendas</h4>
        <hr />
        <DataTable />
      </div>

      <Footer />
    </>
  );
}

export default App;
