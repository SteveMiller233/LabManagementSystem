package com.iotdreamclub.demo;

import com.iotdreamclub.demo.dao.DeviceMapper;
import com.iotdreamclub.demo.dao.MatchMapper;
import com.iotdreamclub.demo.dao.RoleModuleMapper;
import com.iotdreamclub.demo.dao.UserDao;
import com.iotdreamclub.demo.entity.DeviceInfo;
import com.iotdreamclub.demo.entity.RoleModule;
import com.iotdreamclub.demo.service.FunctionService;
import com.iotdreamclub.demo.service.UserService;
import com.iotdreamclub.demo.service.impl.FunctionServiceImpl;
import net.ipip.ipdb.CityInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTest {

    public static final String dateFormat = "yyyyMMddHHmmss";

    @Autowired
    private RoleModuleMapper roleModuleMapper;

    @Autowired
    private DeviceMapper deviceMapper;

    @Autowired
    private MatchMapper matchMapper;

    @Autowired
    private UserDao userDao ;

    @Test
    public void testfindByCondition(){

    }

    @Test
    public void testSelectDeviceByContent(){
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setDeviceName("");
        List<DeviceInfo> list = deviceMapper.selectAllByKeyword(deviceInfo);
        System.out.println(list);
    }

    @Test
    public void testRoleSelectByUsername(){
        List<RoleModule> roleModules = roleModuleMapper.selectAllByLimit("1");
        roleModules.forEach(roleModule -> System.out.println(roleModule));
    }

    @Test
    public void testDeviceInfo(){
        List<DeviceInfo> deviceInfos = deviceMapper.selectAll();
        deviceInfos.forEach(deviceInfo -> System.out.println(deviceInfo));
    }

//    @Test
//    public void testDeviceInsert(){
//        deviceMapper.changeDeviceInfo("test01","test01",1,"test01",5L);
//    }

//    @Test
//    public void testCreateNewBillTable(){
//        SimpleDateFormat dateNow = new SimpleDateFormat(dateFormat);
//        matchMapper.createNewMatchBillTable(dateNow.format(new Date()));
//    }

    @Test
    public void testAddressDatabase(){
        FunctionService functionService = new FunctionServiceImpl();
        System.out.println(functionService.getAddrInfoFromDB("171.82.159.241"));
    }

//    @Test
//    public void testInsertIntoLoginInfo(){
//        FunctionService functionService = new FunctionServiceImpl();
//        CityInfo cityInfo = functionService.getAddrInfoFromDB("171.82.159.241");
//        userDao.insertLoginInfo("Test","171.82.159.241",cityInfo.getCountryName()+"-"+cityInfo.getRegionName()+"-"+cityInfo.getCityName());
//    }
}
