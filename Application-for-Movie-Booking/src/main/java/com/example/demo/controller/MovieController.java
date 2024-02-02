package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MovieController {
    //@Autowired
    //private TradeService tradeService;

    //static  Logger logger
      //      = LoggerFactory.getLogger(TradeStoreController.class);


    /*
    @RequestMapping(value="/movie", method= RequestMethod.POST)
    public Movie createTrade(@RequestBody Trade trade) {

        if(trade.getTradeId() == null || trade.getVersion() == 0 ||
                trade.getMaturityDate() == null || trade.getCreatedDate() == null) {


            logger.warn("Invalid trade record");
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST, "Invalid Trade request");

        }

        return tradeService.createTrade(trade);
    }

     */


    @RequestMapping(value="/theatre", method=RequestMethod.GET)
    //public List<Theatre> readTheatres() {
    public String readTheatres() {

        //logger.info("Inside read Theatres");


        return "List of Movies";
    }

/*

    @RequestMapping(value="/trades/{tradeId}", method=RequestMethod.GET)
    public List<Trade> readTradesbyId(@PathVariable(value = "tradeId") String id) {

        try {
            List<Trade> trades = tradeService.getTradesByTradeId(id);
            return trades;
        } catch (NoSuchElementException exception) {
            logger.warn("Trade Not Found");
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Trade Not Found", exception);

        }


    }

    @RequestMapping(value="/trades/{tradeId}/{version}", method=RequestMethod.GET)
    public Trade readTradesbyIdAndVersion(@PathVariable(value = "tradeId") String id,
                                          @PathVariable(value = "version") int version) {

        try {
            Trade trade = tradeService.getTradesByIdVersion(id,version);

            if(trade == null) {
                logger.warn("Trade Not Found");
                throw new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Trade Not Found");
            }

            return trade;
        } catch (NoSuchElementException exception) {

            logger.warn("Trade Not Found");
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Trade Not Found", exception);

        }


    }

    @RequestMapping(value="/trades/expired", method=RequestMethod.GET)
    public List<Trade> getExpiredTrades(@RequestParam(name = "expired") String expiredFlag) {

        logger.info("Inside getExpiredTrades");

        return tradeService.getExpiredTrades();
    }

    @RequestMapping(value="/trades/expired", method=RequestMethod.PUT)
    public List<Trade> updateExpiredTrades(@RequestParam(name = "expired") String expiredFlag) {

        logger.info("Inside updateExpiredTrades");

        return tradeService.updateExpiredTrades();
    }


    @RequestMapping(value="/trades/{tradeId}/{version}", method=RequestMethod.PUT)
    public Trade updateTrade(@PathVariable(value = "tradeId") String id,
                             @PathVariable(value = "version") int version,
                             @RequestBody Trade tradeDetails) {

        logger.info("Inside updateTrade");

        return tradeService.updateTrade(id, version, tradeDetails);
    }


    @RequestMapping(value="/trades/{tradeId}/{version}", method=RequestMethod.DELETE)
    public void deleteTrades(@PathVariable(value = "tradeId") String id,
                             @PathVariable(value = "version") int version) {
        logger.info("Inside deleteTrades");
        tradeService.deleteTrade(id, version);
    }

 */
}
