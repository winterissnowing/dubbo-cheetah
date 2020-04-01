package org.apache.dubbo.container;


import org.apache.dubbo.common.extension.SPI;

/**
 * Container. (SPI, Singleton, ThreadSafe)
 *  */
@SPI("spring")
public interface Container {

    /**
     * start method to load the container;
     * */
    void start();

    /**
     * stop method to unload the container;
     * */
    void stop();

}
