package services;

import dao.IContractServiceDao;

public class ContractService{
    private IContractServiceDao contractServiceDao;

    public ContractService(IContractServiceDao contractServiceDao) {
        this.contractServiceDao = contractServiceDao;
    }

    public String save(){
        contractServiceDao.save();
        return "sucesso";
    }

    public Boolean delete(String id) {
        contractServiceDao.delete(id);
        return true;
    }

    public Boolean toUpdate(Contract contract) {
        contractServiceDao.toUpdate(contract);
        return true;
    }

    public Boolean search(String id) {
        contractServiceDao.search(id);
        return true;
    }
}
