package demo.service

import spock.lang.Specification

class EmailServiceSpec extends Specification {
    def "get-instance"() {
        given:
        def emailService1=EmailService.getInstance()
        def emailService2=EmailService.getInstance()
        
        expect:
        emailService1.hashCode()==emailService2.hashcode()
    }
    def "send-email"() {
        given:
        def emailService1=EmailService.getInstance()
        def order=new OrderService()
        
        when:
        boolean value=emailService1.sendEmail(order,"cc")
        
        expect:
        value==true
    }
}
