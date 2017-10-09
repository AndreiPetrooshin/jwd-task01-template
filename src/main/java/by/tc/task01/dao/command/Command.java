package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;

import java.util.Properties;


public interface Command {

    Appliance create(Properties properties);

}
