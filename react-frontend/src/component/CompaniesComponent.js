import React from "react";
import CompaniesService from "../services/CompaniesService";

class CompaniesComponent extends React.Component {

    constructor(props) {
        super(props)
        this.state = {
            companies: []
        }
    }

    // use componentDidMount lifecycle method
    componentDidMount() {
        CompaniesService.getCompanies().then((response) => {
            this.setState({ companies: response.data})
        });
    }

    render() {
        return (
            <div>
                <h1 className = "text-center"> Companies List</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <td> Company Id </td>
                            <td> Company Name </td>
                            <td> Company Email </td>
                            <td> Company Address </td>
                            <td> Company Phone Number </td>
                        </tr>
                    </thead>
                    <tbody>
                        {/* in body we execute JSX code */}
                        {
                            this.state.companies.map(
                                company =>
                                <tr key={company.id}>
                                    <td> {company.id} </td>
                                    <td> {company.name} </td>
                                    <td> {company.email} </td>
                                    <td> {company.address} </td>
                                    <td> {company.phoneNumber} </td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}

export default CompaniesComponent;