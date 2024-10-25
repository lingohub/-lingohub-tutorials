from django.shortcuts import render
from django.utils.translation import gettext as _
# Create your views here.
def home (request):
    welcomeMessage = _('Welcome to this Django Internationalization Guide!')
    return render(request,'home.html', {'trans': welcomeMessage})