package org.apache.dubbo.container;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.common.utils.ArrayUtils;
import org.apache.dubbo.common.utils.ConfigUtils;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import static org.apache.dubbo.common.constants.CommonConstants.COMMA_SPLIT_PATTERN;


public class Main {

    public static final String CONTAINER_KEY  = "dubbo.container";

    public static final String SHUTDOWN_HOOK_KEY = "dubbo.shutdown.hook";

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    private static final ExtensionLoader<Container> loader = ExtensionLoader.getExtensionLoader(Container.class);

    private static final ReentrantLock LOCK = new ReentrantLock();

    private static final Condition STOP = LOCK.newCondition();

    public static void main(String[] args) {
       if (ArrayUtils.isEmpty(args)) {
            String extName = loader.getDefaultExtensionName();
            String config = ConfigUtils.getProperty(CONTAINER_KEY, loader.getDefaultExtensionName());
            System.out.println(extName);
            args = COMMA_SPLIT_PATTERN.split(config);
       }
       /*

       final List<Container> containers = new ArrayList<Container>();
        for (int i = 0; i <args.length ; i++) {
            containers.add(loader.getExtension(args[i]));
        }
        logger.info("Use container type(" + Arrays.toString(args) + ") to run dubbo service.");
        */

    }




}
