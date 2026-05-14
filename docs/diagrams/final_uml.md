classDiagram
    class Notification { <<interface>> }
    class NotificationStrategy { <<interface>> }
    class NotificationObserver { <<interface>> }
    
    Notification <|.. SmsNotification
    Notification <|.. EmailNotification
    Notification <|.. TwitterAdapter
    Notification <.. NotificationDecorator
    NotificationDecorator <|-- LogDecorator
    
    UrgentNotification ..|> NotificationStrategy
    AnalyticsService ..|> NotificationObserver
    
    NotificationFactory ..> Notification : Creates
