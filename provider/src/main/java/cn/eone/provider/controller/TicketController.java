package cn.eone.provider.controller;

import cn.eone.provider.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ Author     ：pengzhaofeng
 * @ Date       ：Created in 16:43 2018/12/8 0008
 * @ Description：
 * @ Modified By：
 * @Version:
 **/

@RestController
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @RequestMapping("/")
    public String index() {
        return ticketService.buyTicket();
    }
}
