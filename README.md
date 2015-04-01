# JavaCardDeck
Coding assignment for R/GA
JavaCardDeck Implemented features:.
1). Shuffling with Collections shuffle method (lazy).
2). Shuffling with implementation by permutation inside array.
3). Sorting with Collections sort method (lazy).
4). Implemented a Card Deck quick sorting method to sort the shuffled array.
5). Implemented get all cards in the same suit from the shuffled deck.
6). 6 Junit test cases.


 -----Exhibation of implemented behaviors -----



Initial deck ...
Deck {DIAMONDS:A DIAMONDS:B DIAMONDS:C DIAMONDS:D DIAMONDS:E DIAMONDS:F DIAMONDS:G DIAMONDS:H DIAMONDS:I DIAMONDS:O DIAMONDS:J DIAMONDS:Q DIAMONDS:K CLUBS:A CLUBS:B CLUBS:C CLUBS:D CLUBS:E CLUBS:F CLUBS:G CLUBS:H CLUBS:I CLUBS:O CLUBS:J CLUBS:Q CLUBS:K HEARTS:A HEARTS:B HEARTS:C HEARTS:D HEARTS:E HEARTS:F HEARTS:G HEARTS:H HEARTS:I HEARTS:O HEARTS:J HEARTS:Q HEARTS:K SPADES:A SPADES:B SPADES:C SPADES:D SPADES:E SPADES:F SPADES:G SPADES:H SPADES:I SPADES:O SPADES:J SPADES:Q SPADES:K }

Shuffled deck ...
Deck {DIAMONDS:O HEARTS:F HEARTS:D CLUBS:A SPADES:J CLUBS:H SPADES:D DIAMONDS:G HEARTS:Q CLUBS:I SPADES:I SPADES:O CLUBS:Q DIAMONDS:A SPADES:H HEARTS:O CLUBS:O HEARTS:B DIAMONDS:F SPADES:G CLUBS:D HEARTS:C SPADES:C SPADES:A SPADES:Q DIAMONDS:D CLUBS:C HEARTS:A DIAMONDS:H CLUBS:E DIAMONDS:C DIAMONDS:I DIAMONDS:B SPADES:E SPADES:K CLUBS:G SPADES:F DIAMONDS:Q HEARTS:G CLUBS:B HEARTS:H CLUBS:K HEARTS:K HEARTS:J DIAMONDS:E SPADES:B DIAMONDS:K CLUBS:J CLUBS:F HEARTS:I HEARTS:E DIAMONDS:J }

Diamound Suit in shuffled deck ...
[DIAMONDS:O, DIAMONDS:G, DIAMONDS:A, DIAMONDS:F, DIAMONDS:D, DIAMONDS:H, DIAMONDS:C, DIAMONDS:I, DIAMONDS:B, DIAMONDS:Q, DIAMONDS:E, DIAMONDS:K, DIAMONDS:J]

CLUBS Suit in shuffled deck ...
[CLUBS:A, CLUBS:H, CLUBS:I, CLUBS:Q, CLUBS:O, CLUBS:D, CLUBS:C, CLUBS:E, CLUBS:G, CLUBS:B, CLUBS:K, CLUBS:J, CLUBS:F]

HEARTS Suit in shuffled deck ...
[HEARTS:F, HEARTS:D, HEARTS:Q, HEARTS:O, HEARTS:B, HEARTS:C, HEARTS:A, HEARTS:G, HEARTS:H, HEARTS:K, HEARTS:J, HEARTS:I, HEARTS:E]

SPADES Suit in shuffled deck ...
[SPADES:J, SPADES:D, SPADES:I, SPADES:O, SPADES:H, SPADES:G, SPADES:C, SPADES:A, SPADES:Q, SPADES:E, SPADES:K, SPADES:F, SPADES:B]

Sorting the shuffled deck ...
Deck {DIAMONDS:A DIAMONDS:B DIAMONDS:C DIAMONDS:D DIAMONDS:E DIAMONDS:F DIAMONDS:G DIAMONDS:H DIAMONDS:I DIAMONDS:O DIAMONDS:J DIAMONDS:Q DIAMONDS:K CLUBS:A CLUBS:B CLUBS:C CLUBS:D CLUBS:E CLUBS:F CLUBS:G CLUBS:H CLUBS:I CLUBS:O CLUBS:J CLUBS:Q CLUBS:K HEARTS:A HEARTS:B HEARTS:C HEARTS:D HEARTS:E HEARTS:F HEARTS:G HEARTS:H HEARTS:I HEARTS:O HEARTS:J HEARTS:Q HEARTS:K SPADES:A SPADES:B SPADES:C SPADES:D SPADES:E SPADES:F SPADES:G SPADES:H SPADES:I SPADES:O SPADES:J SPADES:Q SPADES:K }

Is the deck sorted ...true

Shuffle with Java Library method ...
Deck {CLUBS:G SPADES:K DIAMONDS:G HEARTS:D DIAMONDS:E DIAMONDS:H HEARTS:F HEARTS:J SPADES:E SPADES:D HEARTS:Q SPADES:A DIAMONDS:D DIAMONDS:A SPADES:Q CLUBS:E HEARTS:H CLUBS:H SPADES:B DIAMONDS:K SPADES:H CLUBS:F HEARTS:B CLUBS:K SPADES:G CLUBS:C CLUBS:J SPADES:C HEARTS:E HEARTS:K DIAMONDS:J SPADES:F CLUBS:Q DIAMONDS:F SPADES:I CLUBS:O HEARTS:G SPADES:J CLUBS:D HEARTS:I DIAMONDS:Q CLUBS:A SPADES:O DIAMONDS:B HEARTS:C DIAMONDS:C CLUBS:I HEARTS:O DIAMONDS:O HEARTS:A CLUBS:B DIAMONDS:I }

Sort with java library method ...
Deck {DIAMONDS:A DIAMONDS:B DIAMONDS:C DIAMONDS:D DIAMONDS:E DIAMONDS:F DIAMONDS:G DIAMONDS:H DIAMONDS:I DIAMONDS:O DIAMONDS:J DIAMONDS:Q DIAMONDS:K CLUBS:A CLUBS:B CLUBS:C CLUBS:D CLUBS:E CLUBS:F CLUBS:G CLUBS:H CLUBS:I CLUBS:O CLUBS:J CLUBS:Q CLUBS:K HEARTS:A HEARTS:B HEARTS:C HEARTS:D HEARTS:E HEARTS:F HEARTS:G HEARTS:H HEARTS:I HEARTS:O HEARTS:J HEARTS:Q HEARTS:K SPADES:A SPADES:B SPADES:C SPADES:D SPADES:E SPADES:F SPADES:G SPADES:H SPADES:I SPADES:O SPADES:J SPADES:Q SPADES:K }
