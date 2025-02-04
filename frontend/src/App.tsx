import NavBar from "components/NavBar";
import Footer from "components/Footer";
import DataTable from "components/DataTable";
import BarChart from "components/BarChart";
import DonutChart from "components/DonutChart";


function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h4 className="text-primary py-3">Dashboard Vendas</h4>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de Sucesso (%)</h5>
            <DonutChart />
          </div>
        </div>
        
        
        
        <div className="py-3">
        <h4 className="text-primary py-3">Todas as Vendas</h4>
        </div>
        <DataTable />
      </div>

      <Footer />
    </>
  );
}

export default App;
