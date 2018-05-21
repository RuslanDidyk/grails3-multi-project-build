/**
 * TagLib to work with Html render, etc.
 */
class HtmlTagLib {
    static namespace = "html"

    def grailsResourceLocator

    /**
     * Closure that accepts file name and returns file text.
     */
    def render = { attrs ->
        String filePath = attrs.file
        if (!filePath) {
            throwTagError("'file' attribute must be provided!")
        }
        out << grailsResourceLocator.findResourceForURI(filePath).file.text
    }
}
