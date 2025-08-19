package dao.mock;

import dao.IContractServiceDao;

public class ContractServiceMock implements IContractServiceDao {
    @Override
    public String save() {
        return "sucesso";
    }
}
