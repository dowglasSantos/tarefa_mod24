package test;

import services.ContractService;
import dao.ContractServiceDao;
import dao.mock.ContractServiceMock;
import org.junit.Assert;
import org.junit.Test;

public class ContractTest {
    @Test
    public void saveTest() {
        ContractService service = new ContractService(new ContractServiceMock());
        String result = service.save();

        Assert.assertEquals("sucesso", result);
    }

    @Test(expected =  UnsupportedOperationException.class)
    public void errorSaveTest() {
        ContractService service = new ContractService(new ContractServiceDao());
        String result = service.save();
        Assert.assertEquals("sucesso", result);
    }
}
