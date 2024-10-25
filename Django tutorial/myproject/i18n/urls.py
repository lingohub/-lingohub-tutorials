from django.urls import path
from . import views
app_name = 'i18n'
urlpatterns = [
    path('', views.home, name='Welcome to this Django Internationalization Guide!'),
]