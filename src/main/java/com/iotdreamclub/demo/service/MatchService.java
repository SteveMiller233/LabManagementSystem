package com.iotdreamclub.demo.service;

import com.iotdreamclub.demo.entity.Bill;
import com.iotdreamclub.demo.entity.Match;

import java.sql.Date;
import java.util.List;

public interface MatchService {
    void addNewMatchInfo(String matchName , Date matchTime , String matchNameFormat);
    void createNewMatchBillTable(String matchName);
    List<Match> showListOfMatch();

    List<Bill> selectedMatchTablle(String matchNameFormat);
    void deleteMatchTable(String matchNameFormat);
    void deleteMatchInfo(String matchNameFormat);

    void initializeTabel(String matchNameFormat);

    String formatDateInfo(java.util.Date matchTime);

    void add(String matchNameFormat, float billMoney, int billType, String billComment, Date billTime, float billBalance);
    float sumBillMoney(String matchNameFormat);
    void deleteMatchBillInfo(String matchNameFormat,Long billId);
}
