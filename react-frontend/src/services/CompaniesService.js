import axios from "axios";

const COMPANIES_REST_API_URL = 'http://localhost:8081/api/v1/companies/get-all-companies';

class CompaniesService {
    
    getCompanies() {
        return axios.get(COMPANIES_REST_API_URL);
    }
}

export default new CompaniesService();