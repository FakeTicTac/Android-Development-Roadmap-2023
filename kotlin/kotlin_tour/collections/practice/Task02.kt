package kotlin_tour.collections.practice

fun main() {
    val supportedProtocols = listOf("HTTP", "HTTPS", "FTP")
    val requestedProtocol = "smtp"

    val isProtocolSupported = requestedProtocol.uppercase() in supportedProtocols
    println("Support for $requestedProtocol: $isProtocolSupported")
}
