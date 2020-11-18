Step 1: Add RabbitMQConfig
  - Add Bean  DirectExchange
  - Add Bean  Queue
  - Add Bean Binding
  - Add Bean MessageConverter
  - Add Bean AmqpTemplate
  
Step 2: Send Message
  - amqpTemplate.convertAndSend(exchange, routingKey, data);
