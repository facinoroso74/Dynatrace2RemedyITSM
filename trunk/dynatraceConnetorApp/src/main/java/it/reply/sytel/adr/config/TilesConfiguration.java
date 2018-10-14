package it.reply.sytel.adr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@EnableWebMvc
@Configuration
public class TilesConfiguration
{
//  @Bean
//  public TilesConfigurer tilesConfigurer()
//  {
//    TilesConfigurer tilesConfigurer = new TilesConfigurer();
//    
//    //String[] defs = { "WEB-INF/tiles.xml" };
//    String[] defs = { "tiles.xml" };
//    tilesConfigurer.setDefinitions(defs);
//    
//    return tilesConfigurer;
//  }
  @Bean
	public TilesConfigurer tilesConfigurer() {

		TilesConfigurer tconf = new TilesConfigurer();
		tconf.setDefinitions(new String[] { "/WEB-INF/tiles/tiles.xml" });
		return tconf;

	}
  
  @Bean
  public UrlBasedViewResolver tilesViewResolver()
  {
    UrlBasedViewResolver tilesViewResolver = new UrlBasedViewResolver();
    
    tilesViewResolver.setViewClass(TilesView.class);
    
    return tilesViewResolver;
  }
}
