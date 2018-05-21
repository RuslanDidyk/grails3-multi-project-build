package web.plugin

/**
 * Demo controller to render html.
 */
class DemoController {

    def index() {
        render template: 'demoTemplate'
    }
}
