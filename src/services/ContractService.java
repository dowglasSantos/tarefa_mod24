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
}
