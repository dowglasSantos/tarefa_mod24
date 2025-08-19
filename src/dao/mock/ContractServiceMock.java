package dao.mock;

import dao.IContractServiceDao;
import services.Contract;

public class ContractServiceMock implements IContractServiceDao {
    @Override
    public String save() {
        return "sucesso";
    }

    @Override
    public Boolean delete(String id) {
        return true;
    }

    @Override
    public Boolean toUpdate(Contract contract) {
        return true;
    }

    @Override
    public Boolean search(String id) {
        return true;
    }
}
