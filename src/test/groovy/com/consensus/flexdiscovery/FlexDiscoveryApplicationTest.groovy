package com.consensus.flexdiscovery

import devbadger.DiscoveryApp
import spock.lang.Specification

/**
 * Created by Badger on 2/12/18.
 */

class FlexDiscoveryApplicationTest extends Specification{

    def "Application context git backend loads successfully"(){
        expect: DiscoveryApp.main(["--spring.profiles.active=test"] as String[])
    }

}
