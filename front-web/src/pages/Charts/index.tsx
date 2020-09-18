import React from 'react';
import Filters from '../../components/Filters';
import './styles.css';
import Chart from 'react-apexcharts';
import { barOptions, pieOptions } from './chart-options';

const ChartData = [
    {
        x: "Dario",
        y: 10
    },
    {
        x: "Fario",
        y: 13
    },
    {
        x: "Mario",
        y: 12
    }
]

const Charts = () => {

    return (
        <div className="page-container">
            <Filters link="/records" linkText="VER TABELA"/>
            <div className="chart-container">
                <div className="top-related">
                    <h1 className="top-related-title">
                        Jogos mais votados.
                    </h1>
                    <div className="games-container">
                        <Chart 
                            options={barOptions}
                            type="bar"
                            width="900"
                            height="150"
                            series={[{data: ChartData}]}
                        />
                    </div>
                </div>
                <div className="charts">
                    <div className="platform-chart">
                        <h2 className="chart-title">Plataformas</h2>
                        <Chart 
                            options={{...pieOptions, labels: ['Dario', 'Nelio']}}
                            type="donut"
                            series={[30, 70]}
                            width="190"
                        />
                    </div>
                    <div className="gender-chart">
                        <h2 className="chart-title">Gênero</h2>
                        <Chart 
                            options={{...pieOptions, labels: ['Dario', 'Nelio']}}
                            type="donut"
                            series={[30, 70]}
                            width="190"
                        />
                    </div>
                </div>
            </div>
        </div>
    );
}

export default Charts;