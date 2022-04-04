package edu.miu.restful.service;


import edu.miu.restful.entity.Logger;

import java.util.List;

public interface LoggerService {

    void save(Logger logger);

    void delete(int id);

    Logger getById(int id);

    List<Logger> getAll();

    void update(int id, Logger logger);

}
