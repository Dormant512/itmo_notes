package com.test;

import org.apache.storm.topology.BasicOutputCollector;
import org.apache.storm.topology.OutputFieldsDeclarer;
import org.apache.storm.topology.base.BaseBasicBolt;
import org.apache.storm.tuple.Fields;
import org.apache.storm.tuple.Tuple;
import org.apache.storm.tuple.Values;

public class MultiplierBolt extends BaseBasicBolt {
    @Override
    public void execute(Tuple tuple, BasicOutputCollector basicOutputCollector) {
        Integer number = tuple.getInteger(0);
        String ans;
        if (number % 3 == 0 && number % 5 == 0) {
            ans = "fizzbuzz";
        } else if (number % 3 == 0) {
            ans = "fizz";
        } else if (number % 5 == 0) {
            ans = "buzz";
        } else {
            ans = "-";
        }

        basicOutputCollector.emit(new Values(ans));
        System.out.println(ans);
    }

    @Override
    public void declareOutputFields(OutputFieldsDeclarer outputFieldsDeclarer) {
        outputFieldsDeclarer.declare(new Fields("field"));
    }
}
