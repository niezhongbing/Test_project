package redis;

import org.junit.Test;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Redis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jedis jedis=new Jedis("47.93.9.151",6379);
		jedis.set("test", "hello jedis");
		System.out.println(jedis.get("test"));
		jedis.close();
	}

	@Test
	public void testJedisPool()throws Exception{
		//JedisPool JedisPool=new JedisPool("47.93.9.151",6379)
		
	}
	
}
