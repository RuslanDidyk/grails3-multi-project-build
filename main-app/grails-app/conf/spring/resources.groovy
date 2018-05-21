import grails.util.BuildSettings
import org.grails.gsp.io.CachingGroovyPageStaticResourceLocator

// Place your Spring DSL code here
beans = {
    abstractGrailsResourceLocator {
        searchLocations = [BuildSettings.BASE_DIR.absolutePath]
    }
    grailsResourceLocator(CachingGroovyPageStaticResourceLocator) { bean ->
        bean.parent = "abstractGrailsResourceLocator"
    }
}
