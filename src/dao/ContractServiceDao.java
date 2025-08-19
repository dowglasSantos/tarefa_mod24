package dao;

import services.Contract;

public class ContractServiceDao implements IContractServiceDao {
    @Override
    public String save()  {
       throw new UnsupportedOperationException("error saving to database");
    }

    @Override
    public Boolean delete(String id) {
        throw new UnsupportedOperationException("error deleting your contract");
    }

    @Override
    public Boolean toUpdate(Contract contract) {
        throw new UnsupportedOperationException("error to update your contract");
    }

    @Override
    public Boolean search(String id) {
        throw new UnsupportedOperationException("error search your contract");
    }
}
