require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: *start
        random:
            a: Привет! Чем могу помочь?
            a: Здравствуйте! Как я могу помочь вам сегодня?
    
    state: Date
        q!: * (дат*/сегодня*) *
        random:
            a: Сегодня 29.12.2024.
    
    state: Week Day
        q!: * (день*) *
        random:
            a: Сегодня воскресенье.
    
    state: CatchAll
        event!: noMatch
        random:
            a: Извините, я не понял. Могу помочь с датой или днем недели.
            a: Попробуйте переформулировать запрос. Я могу сообщить текущую дату или день недели.
            