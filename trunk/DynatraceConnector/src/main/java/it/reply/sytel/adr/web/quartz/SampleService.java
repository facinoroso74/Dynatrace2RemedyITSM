package it.reply.sytel.adr.web.quartz;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

/**
 * Created by david on 2015-01-20.
 */
@Service
public class SampleService {

    private static final Logger LOG = LogManager.getLogger(SampleService.class);

    public void hello() {
        LOG.info("Hello World!");
    }
}

