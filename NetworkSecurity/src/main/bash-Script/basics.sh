#!/usr/bin/env bash
route -n
ifconfig
route -n
ssh root@172.16.50.1
netstat -tuln
ip a show

