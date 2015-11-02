#import libraries and initialize pyGame
import sys, pygame, pygame.mixer
from pygame.locals import *
pygame.init()

size = width, height = 1024, 650
music = pygame.mixer.Sound("Assets/music/TwistedNerve.ogg")
screen = pygame.display.set_mode(size)
pygame.display.set_caption('Kill Bill - The Game')

charHealth = 100

strtImage = pygame.image.load("Assets/img/KillBillGameBkg.png")
strtButtonImage1 = pygame.image.load("Assets/img/startGame1.png")
strtButtonImage2 = pygame.image.load("Assets/img/startGame2.png")
instructButtonImage1 = pygame.image.load("Assets/img/insturct1.png")
instructButtonImage2 = pygame.image.load("Assets/img/insturct2.png")
press_space = pygame.image.load("Assets/img/press_space.png")
blank = pygame.image.load("Assets/img/blank.png")

hover = 1
level = 0
numTicks = pygame.time.get_ticks()
iters = 0
frame = 0

screen.fill((252, 255, 0))
screen.blit(strtImage, (0,0))
screen.blit(strtButtonImage2, (0, 514))
screen.blit(instructButtonImage1, (513, 514))
pygame.display.flip()
music.play()

while level == 0:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            sys.exit()
        elif event.type == KEYDOWN and event.key == K_ESCAPE:
            sys.exit()
        elif event.type == KEYDOWN and event.key == K_RIGHT and hover == 1:
            screen.blit(strtButtonImage1, (0, 514))
            screen.blit(instructButtonImage2, (513, 514))
            pygame.display.flip()
            hover = 2
        elif event.type == KEYDOWN and event.key == K_LEFT and hover == 2:
            screen.blit(strtButtonImage2, (0, 514))
            screen.blit(instructButtonImage1, (513, 514))
            pygame.display.flip()
            hover = 1
        elif event.type == KEYDOWN and event.key == K_SPACE:
            if hover == 1:
                screen.fill((0,0,0))
                pygame.display.flip()
                level += 1
            elif hover == 2:
                pass

    if frame == 0 and pygame.time.get_ticks() - numTicks == 500:
        screen.blit(press_space, (0, 578))
        pygame.display.flip()
        numTicks = pygame.time.get_ticks()
        frame = 1
        iters = 0
    elif frame == 1 and pygame.time.get_ticks() - numTicks == 500:
        screen.blit(blank, (0, 578))
        pygame.display.flip()
        numTicks = pygame.time.get_ticks()
        frame = 0
        iters = 0

intro = pygame.image.load("Assets/img/intro.png")
level1 = pygame.image.load("Assets/img/TheBloodSpateredBride.png")
playLevelStart = True
screen.blit(intro, (0,0))
pygame.display.flip()
music.stop()
music = pygame.mixer.Sound("Assets/music/BangBang.ogg")
music.play()

while level == 1:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            sys.exit()
        elif event.type == KEYDOWN and event.key == K_ESCAPE:
            sys.exit()
    if pygame.time.get_ticks() - numTicks == 3000 and playLevelStart:
        screen.blit(level1, (0,0))
        pygame.display.flip()
    elif pygame.time.get_ticks() - numTicks == 7500 and playLevelStart:
        screen.fill((0,0,0))
        pygame.display.flip()
        playLevelStart = False
        music.stop()
