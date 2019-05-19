package id.kotlin.situng

import org.apache.commons.io.FileUtils
import org.openqa.selenium.OutputType
import org.openqa.selenium.TakesScreenshot
import org.openqa.selenium.chrome.ChromeDriver
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    System.setProperty("webdriver.chrome.driver", "${System.getProperty("user.dir")}/chromedriver")

    var driver: ChromeDriver? = null
    for (i in 0 until 9) {
        driver = ChromeDriver().apply {
            manage().window().fullscreen()
            get("https://pemilu2019.kpu.go.id/#/ppwp/hitung-suara/")
        }
        Thread.sleep(2000)

        val source = (driver as TakesScreenshot).getScreenshotAs(OutputType.FILE)
        val path = "${System.getProperty("user.dir")}/${SimpleDateFormat("yyyyMMddHHmmSS").format(Date())}.situng.png"
        FileUtils.copyFile(source, File(path))
        Thread.sleep(8000)
        driver.close()
    }

    driver?.quit()
}